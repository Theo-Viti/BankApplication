package theo_viti.com.example.accounts.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import theo_viti.com.example.accounts.model.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {

      Accounts findByCustomerId(Long customerId);

}
