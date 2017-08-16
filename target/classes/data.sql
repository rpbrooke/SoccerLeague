INSERT INTO club (league_position, club_name, games_played, wins, losses, ties) VALUES
  (1,'Arsenal',1,1,0,0),
  (5,'Chelsea',2,0,2,0),
  (1,'TeamSoloMid',1,1,0,0),
  (1, 'Cloud9',2,1,1,0),
  (1, 'SKTelecom',1,1,0,0);

INSERT INTO player (player_name, player_number, club_id) VALUES
  ('Tim', 12,'1'),
  ('Jim', 10,'1'),
  ('Kim', 12,'2'),
  ('Pim', 11,'2'),
  ('Mim', 8,'3'),
('Xim', 1,'3'),
('Wim', 2,'4'),
  ('Zim', 7,'4');



INSERT INTO match(home_team, away_team, home_score, away_score) VALUES
  ('Arsenal','Chelsea',2,0),
  ('Chelsea', 'Cloud9', 1,2),
  ('TeamSoloMid','Chelsea',1,0),
  ('SKTelecom', 'Cloud9', 0,2);