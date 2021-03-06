package com.kalaazu.persistence.service;

import com.kalaazu.persistence.entity.AccountsTechfactoriesEntity;
import com.kalaazu.persistence.repository.AccountsTechfactoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * AccountsTechfactories service.
 * =================================
 *
 * Service for the AccountsTechfactories entity.
 *
 * @author Manulaiko <manulaiko@gmail.com>
 */
@Service
public class AccountsTechfactoriesServiceImpl implements AccountsTechfactoriesService {
    @Autowired
    private AccountsTechfactoriesRepository repository;

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoriesEntity create(AccountsTechfactoriesEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoriesEntity find(Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    /**
     * @inheritDoc
     */
    @Override
    public List<AccountsTechfactoriesEntity> findAll() {
        return this.repository.findAll();
    }

    /**
     * @inheritDoc
     */
    @Override
    public AccountsTechfactoriesEntity update(AccountsTechfactoriesEntity entity) {
        return this.repository.save(entity);
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean delete(Integer id) {
        this.repository.deleteById(id);

        return !this.repository.existsById(id);
    }
}