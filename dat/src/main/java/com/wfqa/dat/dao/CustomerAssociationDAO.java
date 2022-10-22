package com.wfqa.dat.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.wfqa.dat.entity.CustomerAssociation;

@Repository
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
			final StringBuffer query = new StringBuffer();
			final List<Object> params = new ArrayList<Object>();

			query.append(
					"SELECT A.ID,A.SUB_ACCOUNT AS subaccount,SUBSTR(B.FIRST_NAME,1,25) || ',' || SUBSTR(C.STREET1,1,20) || ',' || C.CITY || ',' || C.STATE,"
							+ " B.FIRST_NAME AS collectionSite, C.STATE AS state, C.CITY AS city");

			query.append(" FROM MRO.DAT_CUSTOMER_ASSOCIATIONS A");
			query.append(" INNER JOIN DAT.SITES B ON A.COLLECTION_SITE_ID = B.ID AND B.STATUS = ?");
			query.append(" INNER JOIN DAT.ADDRESSES C ON B.ADDRESS_ID = C.ID AND C.STATUS = ?");
			params.add("A");
			params.add("A");

			query.append(" WHERE A.CUSTOMER_ID = ?");
			params.add(customerId);

			query.append(" AND A.TEST_TYPE = ?");
			params.add(testType);

			query.append(" AND A.STATUS = ?");
			params.add("A");

			query.append(" AND SUB_ACCOUNT IS NOT NULL");

			if (labId != null && labId > 0) {
				query.append(" AND A.LAB_ID = ?");
				params.add(labId);
			}

			if (mroId != null && mroId > 0) {
				query.append(" AND A.MRO_ID = ?");
				params.add(mroId);
			}

			if (cityName != null) {
				query.append(" AND SOUNDEX(SUBSTR(C.CITY,1," + cityName.length() + ")) = SOUNDEX('" + cityName + "')");
			}

			if (csName != null) {
				query.append(
						" AND SOUNDEX(SUBSTR(B.FIRST_NAME,1," + csName.length() + ")) = SOUNDEX('" + csName + "')");
			}

			query.append(" ORDER BY " + sortBy);
			TypedQuery<CustomerAssociation> associationQuery = entityManager.createQuery(query.toString(),
					CustomerAssociation.class);
			return associationQuery.getResultList();

		}
		return null;
	}
	 
}
