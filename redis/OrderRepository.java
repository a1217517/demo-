package com.example.demo.redis;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface OrderRepository extends JpaRepository<Order,String>, JpaSpecificationExecutor<Order> {

    Page<Order> findByOrderStateLessThan(int orderState, Pageable pageable);

    Page<Order> findByOrderState(int orderState, Pageable pageable);

    Page<Order> findByOrderStateGreaterThan(int orderState, Pageable pageable);

    Page<Order> findByGuidAndOrderStateAndValidState(String guid, int orderState, int validState, Pageable pageable);

    Page<Order> findByGuidAndValidState(String guid, int validState, Pageable pageable);

    List<Order> findByGroupId(String groupId);

    List<Order> findByOrderState(int orderState);

    Page<Order> findByOrderStateAndType(int orderStatus, int type, Pageable pageable);
}
