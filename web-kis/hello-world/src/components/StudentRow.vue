<template>
  <TR>
    <TD>{{studentData.id}}</TD>
    <TD>{{studentData.name}}</TD>
    <TD>{{studentData.surname}}</TD>
  </TR>
</template>
//[{"id":1,"name":"steev","surname":"steev"}]
<script>
export default {
  name: "StudentRow",
  props: {
    studentData: Object
  }
}
</script>

<style scoped>
TR{
  align-items: center;
  background: #FFFFC7;
  //border: 1px solid #B0413E;
  font-size: 20px;
  font-weight: bold;
  text-align: left;

}
TR:hover{
  background-color: #47533335;

}
</style>