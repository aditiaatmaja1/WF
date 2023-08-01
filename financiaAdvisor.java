import javax.persistence.*;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    // Other attributes and relationships
    
    public FinancialAdvisor() {
        // Default constructor
    }
    
    // Getters and setters for other attributes
}
