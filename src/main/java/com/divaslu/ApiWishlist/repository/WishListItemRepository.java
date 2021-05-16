package com.divaslu.ApiWishlist.repository;

import com.divaslu.ApiWishlist.model.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WishListItemRepository extends JpaRepository<WishListItem, Long> {
    List<WishListItem> findWishListItemByidCliente(long idCliente);
    List<WishListItem> findWishListItemByidProduto(long idProduto);
}
