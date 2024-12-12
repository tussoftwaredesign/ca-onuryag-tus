//package com.tus.java.oop1.rms.data.repository.impl;
//
//import com.tus.java.oop1.rms.data.models.RestaurantBranch;
//import com.tus.java.oop1.rms.data.record.RestaurantBranchRecord;
//import com.tus.java.oop1.rms.data.repository.api.IRestaurantBranchRepository;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//@Repository
//public class RestaurantBranchRepositoryImpl implements IRestaurantBranchRepository {
//
//    public RestaurantBranchRepositoryImpl(JdbcTemplate jdbcTemplate) {
//    }
//
//    @Override
//    public void deleteById(Long branchId) {
//
//    }
//
//    @Override
//    public void delete(RestaurantBranch entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends RestaurantBranch> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends RestaurantBranch> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<RestaurantBranch> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public RestaurantBranch getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public RestaurantBranch getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public RestaurantBranch getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends RestaurantBranch> List<S> findAll(Example<S> example) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends RestaurantBranch> List<S> findAll(Example<S> example, Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public <S extends RestaurantBranch> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends RestaurantBranch, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends RestaurantBranch> List<S> saveAll(Iterable<S> entities) {
//        return List.of();
//    }
//
//    @Override
//    public Optional<RestaurantBranch> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<RestaurantBranch> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public List<RestaurantBranch> findAllById(Iterable<Long> longs) {
//        return List.of();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public List<RestaurantBranch> findAll(Sort sort) {
//        return List.of();
//    }
//
//    @Override
//    public Page<RestaurantBranch> findAll(Pageable pageable) {
//        return null;
//    }
//}
