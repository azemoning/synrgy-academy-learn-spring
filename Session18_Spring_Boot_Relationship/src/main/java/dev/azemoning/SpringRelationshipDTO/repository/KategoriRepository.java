package dev.azemoning.SpringRelationshipDTO.repository;

import dev.azemoning.SpringRelationshipDTO.model.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategoriRepository extends JpaRepository<Kategori, Long> {
}
