-- Initial dump for the `npcs` table.


INSERT INTO `npcs` (`id`, `name`, `health`, `shield`, `shield_absorption`, `damage`, `speed`, `gfx`, `ai`)
VALUES (1, '-=[Streuner]=-', 800, 400, 80, 15, 0, 84, 1),
       (2, '-=[Lordakia]=-', 2000, 2000, 80, 90, 0, 71, 2),
       (3, '-=[Saimon]=-', 6000, 3000, 80, 175, 0, 75, 2),
       (4, '-=[Mordon]=-', 20000, 10000, 80, 350, 0, 73, 2),
       (5, '-=[Devolarium]=-', 100000, 100000, 80, 1050, 0, 72, 2),
       (6, '-=[Sibelon]=-', 200000, 200000, 80, 2625, 0, 74, 2),
       (7, '-=[Sibelonit]=-', 40000, 40000, 80, 875, 0, 76, 2),
       (8, '-=[Lordakium]=-', 300000, 200000, 80, 3375, 0, 77, 2),
       (9, '-=[Kristallin]=-', 50000, 40000, 80, 1050, 0, 78, 2),
       (10, '-=[Kristallon]=-', 400000, 300000, 80, 4375, 0, 79, 1),
       (11, '-=[Protegit]=-', 50000, 40000, 80, 1312, 0, 81, 2),
       (12, '-=[Cubikon]=-', 1600000, 1200000, 80, 0, 0, 80, 1),
       (13, '-=[StreuneR]=-', 20000, 10000, 80, 425, 0, 85, 1),
       (14, '-=[demaNer]=-', 400000, 300000, 80, 3750, 0, 11, 2),
       (15, '..::{Boss Streuner}::..', 3200, 1600, 80, 110, 0, 23, 1),
       (16, '..::{Boss Lordakia}::..', 8000, 8000, 80, 322, 0, 24, 2),
       (17, '..::{Boss Saimon}::..', 24000, 12000, 80, 660, 0, 25, 2),
       (18, '..::{Boss Mordon}::..', 80000, 40000, 80, 1400, 0, 31, 2),
       (19, '..::{Boss Devolarium}::..', 400000, 400000, 80, 4375, 0, 26, 2),
       (20, '..::{Boss Sibelon}::..', 800000, 800000, 80, 10725, 0, 46, 2),
       (21, '..::{Boss Sibelonit}::..', 160000, 160000, 80, 3762, 0, 27, 2),
       (22, '..::{Boss Lordakium}::..', 1200000, 800000, 80, 13000, 0, 28, 1),
       (23, '..::{Boss Kristallin}::..', 200000, 160000, 80, 4150, 0, 29, 2),
       (24, '..::{Boss Kristallon}::..', 1600000, 1200000, 80, 17500, 0, 35, 1),
       (25, '..::{Boss StreuneR}::..', 80000, 40000, 80, 1750, 0, 34, 1),
       (26, '<-o(Uber Streuner)o->', 6400, 3200, 80, 220, 0, 23, 1),
       (27, '<-o(Uber Lordakia)o->', 16000, 16000, 80, 644, 0, 24, 2),
       (28, '<-o(Uber Saimon)o->', 48000, 24000, 80, 1320, 0, 25, 2),
       (29, '<-o(Uber Mordon)o->', 160000, 80000, 80, 2800, 0, 31, 2),
       (30, '<-o(Uber Devolarium)o->', 800000, 800000, 80, 8750, 0, 26, 2),
       (31, '<-o(Uber Sibelon)o->', 1600000, 1600000, 80, 21550, 0, 46, 2),
       (32, '<-o(Uber Sibelonit)o->', 320000, 320000, 80, 7524, 0, 27, 2),
       (33, '<-o(Uber Lordakium)o->', 2400000, 1600000, 80, 26000, 0, 28, 1),
       (34, '<-o(Uber Kristallin)o->', 400000, 320000, 80, 8300, 0, 42, 2),
       (35, '<-o(Uber Kristallon)o->', 3200000, 2400000, 80, 37500, 0, 45, 1),
       (36, '<-o(Uber StreuneR)o->', 160000, 80000, 80, 3500, 0, 34, 1),
       (37, '-=[Interceptor]=-', 60000, 40000, 80, 425, 0, 111, 2),
       (38, '-=[Barracuda]=-', 180000, 100000, 80, 5250, 0, 112, 2),
       (39, '-=[Saboteur]=-', 200000, 150000, 80, 3500, 0, 113, 2),
       (40, '-=[Annihilator]=-', 300000, 200000, 80, 13000, 0, 114, 2),
       (41, '-=[Battleray]=-', 500000, 400000, 80, 8500, 0, 115, 2),
       (42, '-=[Corsair]=-', 200000, 120000, 80, 7000, 0, 91, 2),
       (43, '-=[Outcast]=-', 150000, 80000, 80, 4400, 0, 92, 2),
       (44, '-=[Marauder]=-', 100000, 60000, 80, 4000, 0, 93, 2),
       (45, '-=[Vagrant]=-', 40000, 40000, 80, 2200, 0, 94, 2),
       (46, '-=[Convict]=-', 400000, 200000, 80, 10750, 0, 95, 2),
       (47, '-=[Hooligan]=-', 250000, 200000, 80, 8000, 0, 96, 2),
       (48, '-=[Ravager]=-', 300000, 200000, 80, 9500, 0, 97, 2),
       (49, '-=[Century Falcon]=-', 4000000, 3000000, 80, 22000, 0, 90, 2),
       (50, '-=[Infernal]=-', 60000, 50000, 80, 475, 0, 100, 2),
       (51, '-=[Scorcher]=-', 200000, 200000, 80, 1250, 0, 99, 2),
       (52, '-=[Melter]=-', 1000, 0, 80, 10, 0, 102, 1),
       (53, '-=[Devourer]=-', 1000, 0, 80, 10, 0, 105, 1),
       (54, '-=[Emperor Kristallon]=-', 1000, 0, 80, 10, 0, 122, 1),
       (55, '-=[Emperor Lordakium]=-', 1000, 0, 80, 10, 0, 123, 1),
       (56, '-=[Emperor Sibelon]=-', 1000, 0, 80, 10, 0, 124, 1),
       (57, '<=<Icy>=>', 100000, 80000, 80, 750, 0, 103, 2),
       (58, '-=[Ice Meteoroid]=-', 1600000, 1200000, 80, 0, 0, 101, 2),
       (59, '-=[Super Ice Metroid]=-', 3200000, 2400000, 80, 0, 0, 33, 1),
       (60, '<==<Kucurbium>==>', 5000000, 5000000, 80, 22500, 0, 82, 2),
       (61, '<==<Boss Kucurbium>==>', 20000000, 20000000, 80, 55000, 0, 83, 2),
       (62, '-=[Minion]=-', 1000, 0, 80, 10, 0, 117, 1),
       (63, '-=[Hitac 2.0]=-', 1000, 0, 80, 10, 0, 116, 1),
       (64, '-=[Binarybot]=-', 800000, 1200000, 80, 10000, 0, 104, 2),
       (65, '-=[Santabot]=-', 1000, 0, 80, 10, 0, 32, 1),
       (66, '-=[Carnivalbot]=-', 1000, 0, 80, 20, 0, 48, 1),
       (67, '-=[Refreebot]=-', 1000, 0, 80, 20, 0, 89, 1),
       (68, '-=[Lordakia]=-', 2000, 2000, 80, 40, 0, 106, 2),
       (69, '-=[Solarburst]=-', 1000, 0, 80, 10, 0, 107, 1),
       (70, '-=[Twist]=-', 1000, 0, 80, 10, 0, 119, 1),
       (71, '..::{Boss Twist}::..', 1000, 0, 80, 10, 0, 118, 1),
       (72, '-=[Turkey]=-', 1000, 0, 80, 10, 0, 120, 1),
       (73, '-=[Snowman]=-', 1000, 0, 80, 10, 0, 121, 1),
       (74, '-=[Mine Car]=-', 1000, 0, 80, 10, 0, 125, 1),
       (75, '-=[Havok]=-', 50000, 50000, 80, 700, 0, 108, 2),
       (76, 'UFO', 3200000, 2400000, 80, 122500, 0, 20, 2),
       (77, 'mini UFO', 400000, 300000, 80, 4500, 0, 21, 2),
       (78, '-=[Spaceball]=-', 0, 0, 80, 0, 0, 442, 1),
       (79, '-=[Spaceball]=-', 0, 0, 80, 0, 0, 443, 1),
       (80, '-=[Spaceball]=-', 0, 0, 80, 0, 0, 444, 1);
