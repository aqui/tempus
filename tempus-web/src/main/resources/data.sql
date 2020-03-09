INSERT INTO user(id, account_non_expired, account_non_locked, credentials_non_expired, enabled, password, username, email, name, last_name) VALUES (1, true, true, true, true, '$2a$04$Ogte0yZOkFomyZVcIbJh2.OOQAsIZgMz6njmJ20xNjEFi1y9DKyWS', 'admin', 'akifbatur@protonmail.com', 'Akif', 'Batur');
	
INSERT INTO role(id, role_name) VALUES (1, 'ROLE_USER');
	
INSERT INTO role(id, role_name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_role(user_id, role_id) VALUES (1, 1);

INSERT INTO user_role(user_id, role_id) VALUES (1, 2);