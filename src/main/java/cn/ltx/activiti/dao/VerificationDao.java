package cn.ltx.activiti.dao;

import cn.ltx.activiti.entity.Verification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationDao extends JpaRepository<Verification, Long> {

}
