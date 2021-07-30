<template>
  <div class="myBooks">
    <h1>My Books</h1>
    <reading-list />
    <nav>
    <router-link v-bind:to="{name: 'newBook'}">New Books</router-link>
    </nav>
  </div>

</template>

<script>
import ReadingList from "@/components/ReadingList";


export default {
  components: {
    ReadingList
  }
};
</script>
