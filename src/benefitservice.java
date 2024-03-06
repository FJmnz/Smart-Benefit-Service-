package com.smartsavings.services;

import com.smartsavings.models.Benefit;

import java.util.List;

public interface BenefitService {

    List<Benefit> getAllBenefits();

    Benefit getBenefitById(Long id);

    void addBenefit(Benefit benefit);

    void updateBenefit(Long id, Benefit benefit);

    void deleteBenefit(Long id);

}

@Service
public class BenefitServiceImpl implements BenefitService {

    @Autowired
    private BenefitRepository benefitRepository;



}



