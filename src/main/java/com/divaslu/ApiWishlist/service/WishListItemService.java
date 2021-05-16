package com.divaslu.ApiWishlist.service;

import com.divaslu.ApiWishlist.model.WishListItem;
import com.divaslu.ApiWishlist.repository.WishListItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WishListItemService {
    @Autowired
    private WishListItemRepository repository;

    public WishListItem saveWish(WishListItem produto) {
        return repository.save(produto);
    }

    public List<WishListItem> getWishsByClient(long idCliente) {
        return repository.findWishListItemByidCliente(idCliente);
    }

    public List<WishListItem> getWishsByProduto(long idProduto) {
        return repository.findWishListItemByidProduto(idProduto);
    }

    public WishListItem getWishById(long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteWishListItem(long id) {
        repository.deleteById(id);
        return "WishListItem removido: " + id;
    }
}