import javax.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    
    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;
    // Other attributes and relationships
    
    public Security() {
        // Default constructor
    }
    
    // Getters and setters for other attributes and relationships
}
