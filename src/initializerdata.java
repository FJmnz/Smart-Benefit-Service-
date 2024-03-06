package com.smartsavings.config;

import com.smartsavings.models.Benefit;
import com.smartsavings.services.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private BenefitService benefitService;

    @Override
    public void run(String... args) throws Exception {
        // Inicializar algunos datos de prueba
        Benefit benefit1 = new Benefit();
        benefit1.setName("Descuento en restaurantes");
        benefit1.setDescription("Obtén un 20% de descuento en restaurantes seleccionados");
        benefit1.setValue(20.0);
        benefitService.addBenefit(benefit1);

        Benefit benefit2 = new Benefit();
        benefit2.setName("Puntos de fidelización");
        benefit2.setDescription("Gana puntos por cada compra y canjéalos por productos");
        benefit2.setValue(0.0);
        benefitService.addBenefit(benefit2);
    }
}

