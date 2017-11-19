package com.lapots.game.journey.auth.domain.oauth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="oauth_refresh_token")
@Data
public class OAuthRefreshToken {
    @Column(name="token_id")
    private String tokenId;
    private byte[] token;
    private byte[] authentication;
}
