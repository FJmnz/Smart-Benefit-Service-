package com.smartsavings.services;

import com.smartsavings.models.Benefit;
import com.smartsavings.repositories.BenefitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitServiceImpl implements BenefitService {

    @Autowired
    private BenefitRepository benefitRepository;

    @Override
    public List<Benefit> getAllBenefits() {
        return benefitRepository.findAll();
    }

    @Override
    public Benefit getBenefitById(Long id) {
        return benefitRepository.findById(id).orElse(null);
    }

    @Override
    public void addBenefit(Benefit benefit) {
        benefitRepository.save(benefit);
    }

    @Override
    public void updateBenefit(Long id, Benefit benefit) {
        Benefit existingBenefit = benefitRepository.findById(id).orElse(null);
        if (existingBenefit != null) {
            existingBenefit.setName(benefit.getName());
            existingBenefit.setDescription(benefit.getDescription());
            existingBenefit.setValue(benefit.getValue());
            benefitRepository.save(existingBenefit);
        }
    }

    @Override
    public void deleteBenefit(Long id) {
        benefitRepository.deleteById(id);
    }

}

