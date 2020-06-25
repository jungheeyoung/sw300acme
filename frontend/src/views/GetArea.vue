<template>
  <div>
    <v-expansion-panel>
      <v-expansion-panel-content v-for="(item, idx) in response" :key="idx" class="grey lighten-4">
        <div slot="header">
          <h3>{{ item.areaName }}</h3>
        </div>
        <v-card>
          <v-card-text>
            지역명 : {{ item.areaName }}
            <br>
            지역 소개 : {{ item.areaInfo }}
            <br>
            ASA 서비스 설치 현황 : {{ item.areaCount }}개의 장소에서 운영 중
            <br>
            지역 별칭 : {{ item.ormid }}
            <br>
            <v-btn color="primary" @click="selectArea(idx)">Select</v-btn>
          </v-card-text>
        </v-card>
      </v-expansion-panel-content>
      <span v-if="response.length <= 0">
        <h3>해당 지역에는 ASA 서비스가 존재하지 않습니다.</h3>
      </span>
    </v-expansion-panel>
  </div>
</template>

<script>
export default {
  name: "GetArea",
  props: {
    selectedArea: null,
    step: 0
  },
  data() {
    return {
      response: [],
      errors: []
    };
  },
  methods: {
    getAreaList() {
      this.$axios
        .get("/areas")
        .then(res => {
          console.log(res.data);
          this.response = res.data._embedded.area;
        })
        .catch(e => this.errors.push(e));
    },
    selectArea(idx) {
      this.$emit("update:selectedArea", this.response[idx]);
      this.$emit("update:step", this.step + 1);
    }
  },
  created() {
    this.getAreaList();
  }
};
</script>

<style scoped>
</style>