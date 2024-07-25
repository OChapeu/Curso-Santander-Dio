package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}