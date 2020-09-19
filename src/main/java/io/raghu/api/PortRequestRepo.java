package io.raghu.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PortRequestRepo extends JpaRepository<PortRequest, Long> {
	
	@Query(value = "from PortRequest P where P.portid=:portid")
	public PortRequest getPort(@Param("portid") String portid);

}
