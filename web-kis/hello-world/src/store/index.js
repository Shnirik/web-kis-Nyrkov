import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    msg: 'Hello Vue! Hello World!',
    studentList: [{"id":1,"name":"steev","surname":"steev"}]

  },
  getters: {
    getMsg (state){
      return state.msg
    },
    getStudentList(state)
    {
      return state.studentList
    }
  },
  mutations: {
    setStudentList(state, studentList){
      state.studentList = studentList
    }
  },
  actions: {
    async loadStudentList(context){
      try{
        const url = '/kis/student'
        const response = await axios.get(url)
        const results = response.data
        context.commit('setStudentList', results)
      } catch(err){
        if (err.response){
          console.log("Server Error:", err)
        } else if (err.request){
          console.log("Network Error", err)
        } else {
          console.log("Client Error",err)
        }
      }
    }
  },
  modules: {
  }
})
