import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import ArPage from "./views/ArPage"
import GoogleMap from "./views/mapPage"

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/ar-page',
      name: 'ar-page',
      component: ArPage
    },
    {
      path: '/map',
      name: 'google-map',
      component: GoogleMap
    }
  ]
})
