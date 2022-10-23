package com.wfqa.mroplace.service;

import java.util.List;

import com.wfqa.mroplace.dto.CustomerAssociationDTO;
import com.wfqa.mroplace.dto.LANSubAccountDTO;

public interface ICustomerAssociationService {

    CustomerAssociationDTO getSubAccountList(Long customerId, String status);

    List<LANSubAccountDTO> getSubAccountList(long customerId, String testType, Long labId, Long mroId,
            String cityName, String csName, String sortBy);
}
