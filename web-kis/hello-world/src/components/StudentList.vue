<template>
  <div style="text-align: center">
    <button class="btn1" v-on:click="appendRow">
      Добавить
    </button>
    <button class="btn2" v-on:click="appendRow">
     Удалить
    </button>
    <button class="btn3" v-on:click="appendRow">
      Изменить
    </button>
    <TABLE>
      <TR>
        <TH>ID</TH>
        <TH>Name</TH>
        <TH>Surname</TH>
      </TR>
      <student-row v-for="student in studentList" v-bind:key="student.id" :student-data="student">
      </student-row>
    </TABLE>
  </div>
</template>

<script>
import StudentRow from "./StudentRow";

export default {
  name: "StudentList",
  components: {
    StudentRow
 },
  computed:{
    studentList(){
      return this.$store.getters.getStudentList
    },
  },
  methods: {
    appendRow(){
      alert('Сообщение')
    }
  }
}
</script>

<style scoped>

TABLE{

  background: #759AAB;
  width: 70%;
  margin-left: auto;
  margin-right: auto;

}
TR{
  color: #453F78;
}
TR:hover{
  color: #FAF2A1;
}
TH{
  font-size: 20px;
}

</style>