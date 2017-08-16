CREATE TABLE IF NOT EXISTS club
( club_id int(10) not null AUTO_INCREMENT,
  club_name VARCHAR(25) not null,
  games_played int(2),
  league_position int(1) not null,
  wins int(2) not null,
  losses int(2) not null,
  ties int(2) not null,
  PRIMARY KEY (club_id),
);

CREATE TABLE IF NOT EXISTS player
(
  player_id int(10) not null AUTO_INCREMENT,
  player_name VARCHAR(25) NOT NULL,
  player_number int(2),
  club_id int(10),
  PRIMARY KEY (player_id),
  FOREIGN KEY (club_id) REFERENCES club(club_id)
);

CREATE TABLE IF NOT EXISTS match
( match_id  int(10) not null AUTO_INCREMENT,
  home_team VARCHAR(25) not null,
  away_team VARCHAR(25) not null,
  home_score int(2) not null,
  away_score int(2) not null,
  PRIMARY KEY (match_id),
  FOREIGN KEY (home_team) REFERENCES club(club_name),
  FOREIGN KEY (away_team) REFERENCES club(club_name)
);

