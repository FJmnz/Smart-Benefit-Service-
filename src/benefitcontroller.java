
@RestController
@RequestMapping("/benefits")
public class BenefitController {

    @Autowired
    private BenefitService benefitService;

    @GetMapping("/")
    public List<Benefit> getAllBenefits() {
        return benefitService.getAllBenefits();
    }

    @GetMapping("/{id}")
    public Benefit getBenefitById(@PathVariable Long id) {
        return benefitService.getBenefitById(id);
    }

    @PostMapping("/")
    public void addBenefit(@RequestBody Benefit benefit) {
        benefitService.addBenefit(benefit);
    }

    @PutMapping("/{id}")
    public void updateBenefit(@PathVariable Long id, @RequestBody Benefit benefit) {
        benefitService.updateBenefit(id, benefit);
    }

    @DeleteMapping("/{id}")
    public void deleteBenefit(@PathVariable Long id) {
        benefitService.deleteBenefit(id);
    }

}


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;



}
