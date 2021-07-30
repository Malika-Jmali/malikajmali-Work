<template>
<section>
  <h2>Book Details</h2>
  <div class="book-details">
    <book-card v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.isbn" />
    
  </div>
  </section>
</template>

<script>
import BookCard from '@/components/BookCard.vue';

export default {
  name: "book-details",
  computed: {
    books() {
      return this.$store.state.filter((book) => {
        return book.title, book.author, book.isbn;
      });
    }
  },
  components: {
    BookCard
  }
}
</script>

<style>
.new-releases-list {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>
