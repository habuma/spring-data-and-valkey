package com.example.springvalkey;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash
public record Book(
    @Id String id,
    String isbn,
    String title,
    String author) {
}
