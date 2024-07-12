create database juegos;

use juegos;

create table juego(
    id_juego int auto_increment,
    nombre_juego varchar(70) not null,
    genero varchar(100) not null,
    anho varchar(4) not null,
    descripcion text not null,
    primary key (id_juego)
);

insert into juego values (null, "Red Dead Redemption 2", "", "2018", ""),
                         (null, "gow", "", "20", ""),
                         (null, "Assassin's Creed Shadows", "", "2024", ""),
                         (null, "Call of Duty: Black Ops 6", "acción", "2024", ""),
                         (null, "The Last of Us Part II", "", "2020", ""),
                         (null, "Prince of Persia: The Lost Crown", "", "2024", ""),
                         (null, "Crash Team Racing", "aventura", "1999", ""),
                         (null, "Crash Team Rumble", "aventura", "2023", ""),
                         (null, "Crash Bandicoot: On the Run!", "aventura", "2021", ""),
                         (null, "Mortal Kombat", "acción", "1992", ""),
                         (null, "Peter Jackson's King Kong", "acción", "2005", ""), 
                         (null, "Need for Speed: Most Wanted", "", "2005", "");