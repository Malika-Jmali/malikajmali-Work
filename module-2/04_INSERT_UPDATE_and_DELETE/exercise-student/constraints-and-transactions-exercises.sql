-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor
WHERE first_name= 'HAMPTON' or first_name='LISA'

INSERT INTO actor(first_name,last_name)
VALUES ('HAMPTON','AVENUE'),('LISA','BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

SELECT * FROM film
ORDER BY title

INSERT INTO film(title, description, release_year, language_id,length)
VALUES ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece','2008','1','198');
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor(actor_id,film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'HAMPTON' AND last_name = 'AVENUE'),(SELECT film_id FROM film WHERE title = 'Euclidean PI'));

INSERT INTO film_actor(actor_id,film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'LISA' AND last_name = 'BYWAY'),(SELECT film_id FROM film WHERE title = 'Euclidean PI'));

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) VALUES ('Mathmagical');
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'Euclidean PI'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'EGG IGBY'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'KARATE MOON'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'RANDOM GO'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

INSERT INTO film_category(film_id,category_id)
VALUES ((SELECT film_id FROM film WHERE  title = 'YOUNG LANGUAGE'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film SET rating = 'G'
WHERE film_id IN
(SELECT film_id FROM film_category WHERE category_id =
(SELECT category_id FROM category WHERE name = 'Mathmagical'));

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'Euclidean PI'),1);


INSERT INTO inventory(film_id,store_id)
VALUES((SELECT film_id FROM film WHERE title = 'Euclidean PI'),2);
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- because the key exists on another table
DELETE FROM film WHERE title = 'Euclidean PI'; 
-- failed due to being referenced in other tables.
-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- failed due to being referenced in other tables.
DELETE FROM category 
WHERE name = 'Mathmagical';
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- yes because its a primary key
DELETE FROM film_category WHERE category_id = 18;
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
-- The first one succeeds because its no longer being used by the foreign key in the film category table, and the second one fails for the same reason it is still being used by film_category
DELETE FROM category WHERE name = 'Mathmagical';

DELETE FROM film WHERE title = 'Euclidean PI';
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
--When transaction is successful, COMMIT is applied, and when transaction is aborted, ROLLBACK occurs.

BEGIN TRANSACTION;

COMMIT;

ROLLBACK;