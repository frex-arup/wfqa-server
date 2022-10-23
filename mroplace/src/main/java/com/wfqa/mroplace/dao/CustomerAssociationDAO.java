package com.wfqa.mroplace.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.wfqa.mroplace.dto.CustomerAssociationDTO;
import com.wfqa.mroplace.entity.CustomerAssociation;


//@Repository
public class CustomerAssociationDAO {
     @PersistenceContext
     private EntityManager entityManager;
    
    public List<CustomerAssociation> getSubAccountList(long customerId,String testType,Long labId,Long mroId,String cityName,String csName,String sortBy) {
         final StringBuffer query = new StringBuffer();
         final List<Object> params = new ArrayList<Object>(); 
        if (customerId > 0) {

                query.append("select id, subAccount,collectionSiteId,customerId,testType,status,labId,mroId");
                query.append(" from CustomerAssociation");

                query.append(" where customerId  = ?0");
                params.add(customerId);

                query.append(" and testtype = ?1");
                params.add(testType);

                query.append(" and status = 'A'");

                query.append(" and subAccount is not null and (collectionSiteId = 0 or collectionSiteId is null)");

                if (labId != null && labId > 0) {
                    query.append(" and labId = ?2");
                    params.add(labId);
                }

                if (mroId != null && mroId > 0) {
                    query.append(" and mroId = ?3");
                    params.add(mroId);
                }
                query.append(" order by " + sortBy);
               


            }
         TypedQuery<CustomerAssociation> associationQuery = entityManager.createQuery(query.toString(), CustomerAssociation.class);
         return associationQuery.getResultList();
    }
    
    
    public List<CustomerAssociation> getUnionSubAccountList(long customerId, String testType, Long labId, Long mroId,
            String cityName, String csName, String sortBy) {
        if (customerId > 0) {
            final StringBuffer queryStr = new StringBuffer();
            final List<Object> params = new ArrayList<Object>();

            queryStr.append(
                    "SELECT A.ID,A.SUB_ACCOUNT AS subaccount,SUBSTR(B.FIRST_NAME,1,25) || ',' || SUBSTR(C.STREET1,1,20) || ',' || C.CITY || ',' || C.STATE,"
                            + " B.FIRST_NAME AS collectionSite, C.STATE AS state, C.CITY AS city");

            queryStr.append(" FROM MRO.DAT_CUSTOMER_ASSOCIATIONS A");
            queryStr.append(" INNER JOIN DAT.SITES B ON A.COLLECTION_SITE_ID = B.ID AND B.STATUS = ?1");
            queryStr.append(" INNER JOIN DAT.ADDRESSES C ON B.ADDRESS_ID = C.ID AND C.STATUS = ?2");

            queryStr.append(" WHERE A.CUSTOMER_ID = ?3");
            params.add(customerId);

            queryStr.append(" AND A.TEST_TYPE = ?4");
            params.add(testType);

            queryStr.append(" AND A.STATUS = ?5");
            params.add("A");

            queryStr.append(" AND SUB_ACCOUNT IS NOT NULL");

            if (labId != null && labId > 0) {
                queryStr.append(" AND A.LAB_ID = " + labId);
            }

            if (mroId != null && mroId > 0) {
                queryStr.append(" AND A.MRO_ID = "+ mroId);
            }

            if (cityName != null) {
                queryStr.append(" AND SOUNDEX(SUBSTR(C.CITY,1," + cityName.length() + ")) = SOUNDEX('" + cityName + "')");
            }

            if (csName != null) {
                queryStr.append(
                        " AND SOUNDEX(SUBSTR(B.FIRST_NAME,1," + csName.length() + ")) = SOUNDEX('" + csName + "')");
            }

            queryStr.append(" ORDER BY " + sortBy);
            Query query = entityManager.createNativeQuery(queryStr.toString());
            query.setParameter(1, "A");
            query.setParameter(2, "A");
            query.setParameter(3, customerId);
            query.setParameter(4, testType);
            query.setParameter(5, "A");
            System.out.println((List<CustomerAssociationDTO>)query.getResultList());
            TypedQuery<CustomerAssociation> associationQuery = entityManager.createQuery(queryStr.toString(),
                    CustomerAssociation.class);
            return associationQuery.getResultList();

        }
        return null;
    }
     
}
