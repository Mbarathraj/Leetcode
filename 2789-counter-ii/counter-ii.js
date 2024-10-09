/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
   return {
       original:init,
       temp:init,
       increment: function(){
           this.temp+=1;
           return this.temp;
       },
       decrement:function(){
         this.temp-=1;
          return this.temp;
       },
       reset:function(){
           this.temp=this.original;
           return this.original;
       }

   }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */