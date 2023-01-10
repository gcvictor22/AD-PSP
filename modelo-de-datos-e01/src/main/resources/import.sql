INSERT INTO artist (id, name) VALUES (1, 'Artista 1');
INSERT INTO artist (id, name) VALUES (2, 'Artista 2');
INSERT INTO artist (id, name) VALUES (3, 'Artista 3');
INSERT INTO artist (id, name) VALUES (4, 'Artista 4');
INSERT INTO artist (id, name) VALUES (5, 'Artista 5');

INSERT INTO playlist (id, name, description) VALUES (9, 'Coche', 'Canciones para conducir');
INSERT INTO playlist (id, name, description) VALUES (10, 'Fiesta', 'Canciones para escuchar en una fiesta');
INSERT INTO playlist (id, name, description) VALUES (11, 'Me gusta', 'Mis canciones favoritas');

INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (12, 'Cancion 1', 'Album 1', '2023', 1);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (13, 'Cancion 2', 'Album 3', '2023', 1);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (14, 'Cancion 3', 'Album 2', '2023', 2);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (15, 'Cancion 4', 'Album 2', '2023', 2);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (16, 'Cancion 5', 'Album 1', '2023', 3);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (17, 'Cancion 6', 'Album 1', '2023', 3);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (18, 'Cancion 7', 'Album 3', '2023', 4);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (19, 'Cancion 8', 'Album 2', '2023', 5);
INSERT INTO song (id, title, album, year_of_song, artist_id) VALUES (20, 'Cancion 9', 'Album 3', '2023', 5);

INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (12, 9, CURRENT_TIMESTAMP, 1);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (13, 11, CURRENT_TIMESTAMP, 2);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (14, 10, CURRENT_TIMESTAMP, 3);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (15, 10, CURRENT_TIMESTAMP, 4);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (16, 9, CURRENT_TIMESTAMP, 5);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (17, 9, CURRENT_TIMESTAMP, 6);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (18, 11, CURRENT_TIMESTAMP, 7);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (19, 10, CURRENT_TIMESTAMP, 8);
INSERT INTO added_to (song_id, playlist_id, date_time, orden) VALUES (20, 11, CURRENT_TIMESTAMP, 9);