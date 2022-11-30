package com.aimcodes.fashionBlog.repositories;

import com.aimcodes.fashionBlog.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {



}
