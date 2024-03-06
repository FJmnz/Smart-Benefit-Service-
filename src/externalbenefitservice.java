@Service
public class ExternalBenefitService {

    @Value("${external.service.url}")
    private String externalServiceUrl;

    public ExternalBenefitResponse getBenefitsForUser(String userId) {

    }
}

