package com.wfqa.mroplace.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wfqa.mroplace.dto.LANSubAccountDTO;
import com.wfqa.mroplace.entity.CustomerAssociation;

@Repository
public interface CustomerAssociationRepository extends JpaRepository<CustomerAssociation, Long> {
    
    public static String LAN_SUBACCOUNT_QUERY= 
//            "SELECT A.ID, A.SUB_ACCOUNT AS subaccount, ' '  as lanDisplayName, ' ' AS collectionSite, ' ' AS state, ' ' AS city" +
//            " FROM MRO.DAT_CUSTOMER_ASSOCIATIONS A WHERE A.CUSTOMER_ID = :customerId AND A.TEST_TYPE = :testType AND A.STATUS = :status" +
//            " AND SUB_ACCOUNT IS NOT NULL AND (A.COLLECTION_SITE_ID = 0 or A.COLLECTION_SITE_ID is null) AND" +
//            " (:labId = 0 OR A.LAB_ID = :labId) AND (:mroId = 0 OR A.MRO_ID = :mroId)" + " UNION ALL " +
            "SELECT A.ID,A.SUB_ACCOUNT AS subaccount,SUBSTR(B.FIRST_NAME,1,25) || ','"
            + " || SUBSTR(C.STREET1,1,20) || ',' || C.CITY || ',' || C.STATE as lanDisplayName, B.FIRST_NAME AS collectionSite,"
            + " C.STATE AS state, C.CITY AS city FROM MRO.DAT_CUSTOMER_ASSOCIATIONS A INNER JOIN DAT.SITES B"
            + " ON A.COLLECTION_SITE_ID = B.ID AND B.STATUS = :status"
            + " INNER JOIN DAT.ADDRESSES C ON B.ADDRESS_ID = C.ID AND C.STATUS = :status"
            + " WHERE A.CUSTOMER_ID = :customerId AND A.TEST_TYPE = :testType AND A.STATUS = :status"
            + " AND SUB_ACCOUNT IS NOT NULL AND (:labId IS NULL OR :labId = 0 OR A.LAB_ID = :labId) AND"
            + " (:mroId IS NULL OR :mroId = 0 OR A.MRO_ID = :mroId)"
            + " AND (:cityName IS NULL OR :cityName='' OR SOUNDEX(SUBSTR(C.CITY,1,LENGTH(:cityName))) = SOUNDEX(:cityName))"
            + " AND (:csName IS NULL OR :csName='' OR SOUNDEX(SUBSTR(B.FIRST_NAME,1,LENGTH(:csName))) = SOUNDEX(:csName)) ORDER BY :sortBy ASC";

    Optional<CustomerAssociation> findByIdAndStatus(Long id, String status);
    
    @Query(value=LAN_SUBACCOUNT_QUERY, nativeQuery=true)
    List<LANSubAccountDTO> getSubAccountList(Long customerId, String testType, Long labId, Long mroId,
            String cityName, String csName, String sortBy, String status);
    

}
