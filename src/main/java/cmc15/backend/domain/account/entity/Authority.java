package cmc15.backend.domain.account.entity;

import lombok.Getter;

@Getter
public enum Authority {
    ROLE_ADMIN("ROLE_ADMIN"), ROLE_USER("ROLE_USER");

    private final String authority;

    Authority(String authority) {
        this.authority = authority;
    }
}
