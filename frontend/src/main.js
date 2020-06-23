import Vue from 'vue'
import './plugins/axios'
import './plugins/vuetify'
import App from './App.vue'
import 'vuetify/dist/vuetify.min.css'
import router from './router'
import * as VueGoogleMaps from 'vue2-google-maps'

Vue.config.productionTip = false

Vue.use(require('vue-moment'))

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')

Vue.use(VueGoogleMaps, {
  load: {
    key: 'AIzaSyAX8UQFu4U0Cpu5kEctau5eP4qInXDE0R0',
    libraries: 'places', // This is required if you use the Autocomplete plugin
    // OR: libraries: 'places,drawing'
    // OR: libraries: 'places,drawing,visualization'
    // (as you require)

    //// If you want to set the version, you can do so:
    // v: '3.26',
  }
})

Vue.config.productionTip = false