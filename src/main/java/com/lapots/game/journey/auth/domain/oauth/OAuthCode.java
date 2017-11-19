package com.lapots.game.journey.auth.domain.oauth;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="oauth_code")
@Data
public class OAuthCode {
    private String code;
    private byte[] authentication;
}
