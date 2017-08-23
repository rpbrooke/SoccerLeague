INSERT INTO club (points, club_name, games_played, wins, losses, ties) VALUES
  (3,'Arsenal',1,1,0,0),
  (0,'Chelsea',2,0,2,0),
  (3,'TeamSoloMid',1,1,0,0),
  (3, 'Cloud9',2,1,1,0),
  (3, 'SKTelecom',1,1,0,0);

INSERT INTO player (player_name, player_number, club_id) VALUES
  ('Tim', 12,'1'),
  ('Jim', 10,'1'),
  ('Kim', 12,'2'),
  ('Pim', 11,'2'),
  ('Mim', 8,'3'),
('Xim', 1,'3'),
('Wim', 2,'4'),
  ('Zim', 7,'4');



INSERT INTO game(home_id, away_id, home_score, away_score) VALUES
  ('1','2',2,0),
  ('2', '4', 1,2),
  ('3','2',1,0),
  ('3', '4', 0,2);