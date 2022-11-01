package com.wfqa.mroplace.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfqa.dat.dto.SiteDTO;
import com.wfqa.dat.entity.Site;
import com.wfqa.mroplace.dto.CustomerAssociationDTO;
import com.wfqa.mroplace.dto.LANSubAccountDTO;
import com.wfqa.mroplace.entity.CustomerAssociation;
import com.wfqa.mroplace.mapper.CustomerAssociationMapper;
import com.wfqa.mroplace.repository.CustomerAssociationRepository;

@Service
public class CustomerAssociationServiceImpl implements ICustomerAssociationService {

    @Autowired
    private CustomerAssociationRepository customerAssociationRepository;
    @Autowired
    private CustomerAssociationMapper customerAssociationMapper;

    @Override
    public CustomerAssociationDTO getSubAccountList(Long customerId, String status) {
        Optional<CustomerAssociation> customerAssociation = customerAssociationRepository.findByIdAndStatus(customerId,
                status);

        if (customerAssociation.isPresent()) {
            CustomerAssociationDTO customerAssociationDTO = new CustomerAssociationDTO();
            customerAssociationDTO = customerAssociationMapper.toDTO(customerAssociation.get());
            customerAssociationDTO.setSiteDTO(null);
            // siteRepo.getSite();
            return customerAssociationDTO;
        }
        return null;

    }

    @Override
    public List<LANSubAccountDTO> getSubAccountList(long customerId, String testType, Long labId, Long mroId,
            String cityName, String csName, String sortBy) {
    	List<LANSubAccountDTO> subAccountDTOList1 = customerAssociationRepository.getSubAccountList(customerId, testType, labId, mroId, cityName, csName, sortBy, "A");
    	List<LANSubAccountDTO> subAccountDTOList2 = customerAssociationRepository.getSubAccountList(customerId, testType, labId, mroId, sortBy, "A");
    	List<LANSubAccountDTO> subAccountDTOList = new ArrayList<>();
    	subAccountDTOList.addAll(subAccountDTOList2);
    	subAccountDTOList.addAll(subAccountDTOList1);
        return subAccountDTOList;
    }

}
