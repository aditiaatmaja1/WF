import javax.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    // Other attributes and relationships
    
    public Portfolio() {
        // Default constructor
    }
    
    // Getters and setters for other attributes and relationships
}
