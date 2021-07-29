import axios from 'axios';

export default {

  retrieve() {
      return axios.get('/homes')
  },

  addHome(home) {
    return axios.post('/homes', home)
  }

}
