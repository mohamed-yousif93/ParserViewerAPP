package com.example.ParserViewerAPP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParsedDataRepository extends JpaRepository<ServerData,Long> {
}


