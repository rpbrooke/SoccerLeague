CREATE TABLE IF NOT EXISTS league
( league_position int(1) not null,
  club_name VARCHAR(25) not null,
  gamesplayed int(2),
  wins int(2),
  losses int(2),
  ties int(2),
  PRIMARY KEY (club_name),
);

CREATE TABLE IF NOT EXISTS clubs
( club_id int(10) not null AUTO_INCREMENT,
  club_name VARCHAR(25) not null,
  PRIMARY KEY (club_id),
  FOREIGN KEY (club_name) REFERENCES league(club_name)
);

CREATE TABLE IF NOT EXISTS players
(
  player_name VARCHAR(25) NOT NULL,
  player_number int(2),
  club_id int(10),
  PRIMARY KEY (player_name),
  FOREIGN KEY (club_id) REFERENCES clubs(club_id)
);

CREATE TABLE IF NOT EXISTS matches
( match_id  int(10) not null AUTO_INCREMENT,
  home_team VARCHAR(25) not null,
  away_team VARCHAR(25) not null,
  home_score int(2) not null,
  away_score int(2) not null,
  PRIMARY KEY (match_id),
  FOREIGN KEY (home_team) REFERENCES clubs(club_name),
  FOREIGN KEY (away_team) REFERENCES clubs(club_name)
);

