# Dancerush
Backend for a website to view and search through a list of dancerush songs

# Background
It is currently difficulty to search for songs based on specific categories, such as difficulty, name, artist or more importantly whether a song is available by default or not. This would be useful for new players looking for a song they can already play that fits their difficulty level. There are currently 3 options for looking for songs:
- The official dancerush website (which doesn't have all the songs) https://p.eagate.573.jp/game/dan/1st/music/entrance.html
- Remywiki which has the songs available in an annoying to read table view (can't be searched easily) https://remywiki.com/AC_DRS
- The dancerush stardom discord server bot, which requires access to the server (not difficult but need to manually type in commands to the bot)

# Solution
To view the songs in a way that is more easy to view and search, I have created two components. This repository contains the code for an API that returns the following data

 - genre
 - song
 - artist 
 - bpm
 - easy
 - noteseasy
 - normal
 - notesnormal
 - unlocked
 - chinalocked
 - japanonly
 - koreaonly
 - thumbnail
 - easyurl
 - normalurl
 
 The API can be accessed through dancerush.fly.dev/songlist/ with two endpoints
 
## /allsongs
Which returns all the songs

## /songs 
Returns songs based on input e.g. /songs?song=age returns songs with the string 'age' in them (case insensitive)

The other component is the frontend seen here https://github.com/AJ-HH/dancerush-frontend
