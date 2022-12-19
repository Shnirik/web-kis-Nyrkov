<template>
  <div id="app">
    <hello-world>
    </hello-world>
    <student-list>
    </student-list>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import StudentList from "@/components/StudentList";

export default {
  components:{
    HelloWorld,
    StudentList
  },
  async mounted(){
    await this.$store.dispatch('loadStudentList')

  }
}
</script>

<style lang="less">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
  a {
    font-weight: bold;
    color: #2c3e50;
    background: #FCAA67;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
