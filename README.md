# Dancerush
Backend for a website to view and search through a list of dancerush songs

# Background
It is currently difficulty to search for songs based on specific categories, such as difficulty, name, artist or more importantly whether a song is available by default or not. This would be useful for new players looking for a song they can already play that fits their difficulty level. There are currently 3 options for looking for songs:
- The official dancerush website (which doesn't have all the songs) https://p.eagate.573.jp/game/dan/1st/music/entrance.html
- Remywiki which has the songs available in an annoying to read table view (can't be searched easily) https://remywiki.com/AC_DRS
- The dancerush stardom discord server bot, which requires access to the server (not difficult but need to manually type in commands to the bot)

# Tasks TODO

## 1. Backend

The backend will be written using Java and Spring frameworks. It will be deployed to a cloud platform (currently looking at Heroku or Google Cloud).

### 1.1 Get Song List

By going to 
```
{url}/songlist/all
```
it will get the list of all songs.


### 1.2 Deploy to cloud

The backend is available to access online by accessing the API.

## 2. Frontend

The frontend will be put into a seperate repo (link here)

### 2.1 Create card

A card which stores all the information from one song.
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
- image (Not available yet, just have a space for the jacket)

### 2.2 Data Persistence

Ideally, the songlist api will only be called when necessary. Otherwise, the data should be stored by the client so that the list can be manipulated.
Show all the songs in a list within the cards and only access the server when the data is no longer available.

### 2.3 Search bar and options 
- Search by character (string matching)
- Search by difficulty (normal:3)
- Search by difficulty (easy:5)
- Search by artist (artist:zekk)
- Search by category (category:edm)
- Search by bpm? (bpm:>120)
- Search by locked (locked:yes)
Refer to taiko web implementation for ideas

### 2.4 Song modal

If a user clicks on a song, it will bring up a modal with the details + an embedded video showing the chart

## 3. Extra stuff

### 3.1 Update the list

Some songs have been:
Removed

Added
- Make That Body
- Warpstep
- Touch My Body



### 3.2 Song jacket

Get the list of the song jackets and add them to the cards

### 3.3 Aesthetic details

Blue #0ca0f6
Pink-purple #c677e2

### 3.4 Explanation on How to Use

Different search terms, why some details are ? or -1
