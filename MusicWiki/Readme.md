# MusicWiki

MusicWiki is an unofficial Last.fm app that contains information about different music genres, the albums, artists and tracks listed under the genre.


## Specs for MusicWiki


- Display the list of genres available. Genres are called tags in LastFm api. The list will
  initially contain top 10 genres and when the user clicks on the expand button the
  entire list is shown in the same screen.
- Clicking on the genre it should take the user to a page which contains information regarding it. It should have a genre as the title, description of the genre.In the page it should list top albums, top tracks and top artists as different sections.
  - Each item listed under the album should have the cover image if available or a default image, the title and artist.
  - Each item listed under the artists, should have the cover image, if available or a default image and the name.
  - Each item listed under tracks should have the cover image if available or a default image, the title and artist name.

- Clicking on the item: 
  - Albums
    - It should display the cover image, title and the artist information. It should also have the description and the genres. Clicking on the genre it should display the details about the genre, similar to the flow in the first screen.
  - Artist 
    - It should display the image, title ,play count and followers,description, a list of top tracks and top albums and the genres. Clicking on the genre it should display the details about the genre, similar to the flow in the first screen.
    - Clicking on the album should show its information.
