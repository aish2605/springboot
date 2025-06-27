package com.api.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.entity.message;

@Repository
public interface MessageRepo extends JpaRepository<message, Long>{

	
	List<message> findBySecretmsgAndPassword(String msg, String password);
}
