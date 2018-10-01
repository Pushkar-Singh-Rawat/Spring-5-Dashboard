CREATE DATABASE dashboard_db2;
CREATE USER 'dashboard_user2'@'localhost' IDENTIFIED BY 'dashboard_pass2';

GRANT SELECT ON dashboard_db2 to 'dashboard_user2'@'localhost';
GRANT UPDATE ON dashboard_db2 to 'dashboard_user2'@'localhost';
GRANT DELETE ON dashboard_db2 to 'dashboard_user2'@'localhost';
GRANT INSERT ON dashboard_db2 to 'dashboard_user2'@'localhost';