INSERT INTO user(id, account_non_expired, account_non_locked, credentials_non_expired, enabled, password, username, email) VALUES (1, true, true, true, true, '$2a$04$Ogte0yZOkFomyZVcIbJh2.OOQAsIZgMz6njmJ20xNjEFi1y9DKyWS', 'admin', 'akifbatur@protonmail.com');
	
INSERT INTO role(id, role_name) VALUES (1, 'ROLE_USER');
	
INSERT INTO role(id, role_name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_roles(user_id, roles_id) VALUES (1, 1);

INSERT INTO user_roles(user_id, roles_id) VALUES (1, 2);
