import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    
    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor financialAdvisor;
    // Other attributes and relationships
    
    public Client() {
        // Default constructor
    }
    
    // Getters and setters for other attributes and relationships
}
